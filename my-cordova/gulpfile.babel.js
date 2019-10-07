import gulp from 'gulp';

import browserify from 'gulp-browserify';

import babel from 'gulp-babel';

import postcss from 'gulp-postcss';

import pug from 'gulp-pug';

export function script() {
  return gulp.src('src/**/*.js')
    .pipe(babel())
    .pipe(browserify())
    .pipe(gulp.dest('www'));
}

export function style() {
  return gulp.src('src/**/*.css')
    .pipe(postcss())
    .pipe(gulp.dest('www'));
}

export function html() {
  return gulp.src('src/**/*.html')
    .pipe(pug())
    .pipe(gulp.dest('www'));
}

export default gulp.series(script, style, html);
