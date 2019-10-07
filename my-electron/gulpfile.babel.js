import gulp from 'gulp';

import babel from 'gulp-babel';

export function script() {
  return gulp.src('src/**/*.js')
    .pipe(babel())
    .pipe(gulp.dest('dist'));
}

export function html() {
  return gulp.src('src/**/*.html')
    .pipe(gulp.dest('dist'));
}

export function meta() {
  return gulp.src('package.json')
    .pipe(gulp.dest('dist'));
}

const build = gulp.series(script, html, meta);

export default build;
