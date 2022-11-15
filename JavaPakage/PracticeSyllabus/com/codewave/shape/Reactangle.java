package com.codewave.shape;

public class Reactangle extends Shape{
    public Reactangle(int dim1,int dim2){
        super(dim1, dim2);
    }
    public int area(){
        return this.dim1*this.dim2;
    }
}
