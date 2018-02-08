package com.company;

public class ControlAccess02 extends ControlAccess01 {
    public static void main(String[] args) {
        ControlAccess02 a = new ControlAccess02();

        ControlAccess02.NormalClass cnor;

        ProtectedClass cpro;
        cpro = a.new ProtectedClass();
        ControlAccess01.PublicClass cpub;
        cpub = a.new PublicClass();

        PublicClass p;
        ProtectedClass p2;
    }
}
