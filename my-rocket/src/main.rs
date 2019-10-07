#![feature(proc_macro_hygiene, decl_macro)]

#[macro_use] extern crate rocket_contrib;
#[macro_use] extern crate rocket;

use rocket_contrib::json::{JsonValue};
use rocket::{Rocket};

#[get("/greeting")]
fn greet_default() -> JsonValue {
  return json!({ "content": "Hello, World!" })
}

#[get("/greeting/<name>")]
fn greet_with_name(name: String) -> JsonValue {
  return json!({ "content": format!("Hello, {}!", name) });
}

fn rocket() -> Rocket {
  rocket::ignite()
    .mount("/", routes![greet_default, greet_with_name])
}

fn main() {
  rocket().launch();
}

#[cfg(test)]
mod test {
  use super::rocket;
  use rocket::local::Client;
  use rocket::http::Status;

  #[test]
  fn test_greet_default() {
    let client = Client::new(rocket()).unwrap();
    let mut response = client.get("/greeting").dispatch();
    assert_eq!(response.status(), Status::Ok);
    assert_eq!(response.body_string(), Some("{\"content\":\"Hello, World!\"}".into()));
  }

  #[test]
  fn test_greet_with_name() {
    let client = Client::new(rocket()).unwrap();
    let mut response = client.get("/greeting/jack").dispatch();
    assert_eq!(response.status(), Status::Ok);
    assert_eq!(response.body_string(), Some("{\"content\":\"Hello, jack!\"}".into()));
  }
}
