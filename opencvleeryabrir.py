##Este programa lee y muestra en una ventana una imagen de nuestra pc
##Autor Jorge Turriate
import cv2
import numpy as np
img=cv2.imread(r"C:\Users\Usuario\Desktop\python1\horarioxd.png",0)
cv2.imshow('img',img)
cv2.waitKey(0)
cv2.destroyAllWindows()
