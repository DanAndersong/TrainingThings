package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader (ImageTypes type){
        ImageReader reader = null;
        switch (type) {
            case BMP: reader = new BmpReader();break;
            case PNG: reader = new PngReader();break;
            case JPG: reader = new JpgReader();break;
        }

        if (reader != null) return reader;
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
