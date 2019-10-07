import os;

import cv2.cv2 as cv;

for root, dirs, files in os.walk(os.path.join('.', 'dist')):
  for file in files:
    if os.path.splitext(file)[1] == '.jpg':
      image = cv.imread(os.path.join('.', 'dist', file));
      cv.imshow('image', image);
      cv.waitKey(0);
