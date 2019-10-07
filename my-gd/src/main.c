#include <gdfonts.h>
#include <gd.h>
#include <stdio.h>

int main(int argc, char * argv[]) {
  gdImagePtr image = gdImageCreateTrueColor(300, 300);

  int black = gdImageColorAllocate(image, 0, 0, 0);
  int white = gdImageColorAllocate(image, 255, 255, 255);

  gdImageFill(image, 0, 0, white);

  gdFontPtr font = gdFontGetSmall();
  unsigned char * string = (unsigned char *)"Hello world";
  gdImageString(image, font, 150, 150, string, black);

  FILE * jpgOut = fopen("dist/demo.jpg", "wb");
  gdImagePng(image, jpgOut);
  fclose(jpgOut);
  gdImageDestroy(image);
}
