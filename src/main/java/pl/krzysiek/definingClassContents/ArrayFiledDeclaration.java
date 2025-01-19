package pl.krzysiek.definingClassContents;

public class ArrayFiledDeclaration {
    int[] ia;// prefer form
    int ia2[];// c style declaration -> not recommended

    //These can even be mixed, very bad practice
    int[] ia3[] = {{1, 2}, {3}};
}
