import ReactDOM from 'react-dom';
import React from 'react';

class HelloWorld extends React.Component {
  render() {
    return (
      <div>
        Hello World!
      </div>
    );
  }
};

ReactDOM.render(
  <HelloWorld/>,
  document.querySelector('main'),
);
