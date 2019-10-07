const path =  require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const config = {
  mode: 'development',
  entry: path.resolve(__dirname, 'src/js/index.js'),
  output: {
    filename: 'main.js',
    path: path.resolve(__dirname, 'dist')
  },
  module: {
    rules: [
      {
        test: /\.js$/,
        use: [ 'babel-loader' ]
      },
    ]
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: path.resolve(__dirname, 'assets/index.html')
    })
  ],
};

module.exports = config;
