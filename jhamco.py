##Procesamiento de imagen-Filtro
%matplotlib inline
import matplotlib.pyplot as plt
import matplotlib.image as mpimg
import numpy as np
img=mpimg.imread(r'C:\Users\HOLA JHAMPIERRE\Pictures\Camera Roll\Raul.jpg')
imgplot = plt.imshow(img)
lum_img = img[:,:,0]

imgplot = plt.imshow(lum_img)
imgplot.set_cmap('nipy_spectral')
plt.imshow(lum_img)
plt.imshow(lum_img, cmap="hot")
