#code it on python 3 bro!

import math
import os
import random
import re
import sys

# Complete the plusMinus function below.
def plusMinus(arr):

    n = len(arr)

    min = plus = zero = 0
    for i in arr:
        if i == 0:
            zero +=1
        elif i>0:
            plus+=1
        elif i<0:
            min+=1

    print("%.6f" % ((plus/n)))
    print("%.6f" % ((min/n)))
    print("%.6f" % ((zero/n)))

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
