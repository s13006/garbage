#include <stdlib.h>
#include <time.h>
#include "Hoge.h"

JNIEXPORT jint JNICALL Java_Hoge_getNumber
(JNIEnv *env, jobject obj)
{
  srand((unsigned)time(NULL));
  return (int)rand() & 0x7fffffff % 10000;
}
