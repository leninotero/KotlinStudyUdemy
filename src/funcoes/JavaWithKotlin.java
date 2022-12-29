package funcoes;

import kotlin.collections.CollectionsKt;
import java.util.ArrayList;

public class JavaWithKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("Joao", "Maria", "Jose");
        System.out.println(SegundoValorListKt.secondOrNull(list));
    }
}
