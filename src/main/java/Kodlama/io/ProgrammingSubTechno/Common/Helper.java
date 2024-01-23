package Kodlama.io.ProgrammingSubTechno.Common;

import Kodlama.io.ProgrammingSubTechno.entities.concretes.Language;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static final List<Language> LANGUAGES = new ArrayList<Language>();

    static {
        LANGUAGES.add(new Language(1, "C#"));
        LANGUAGES.add(new Language(2, "C"));
        LANGUAGES.add(new Language(3, "C++"));
        LANGUAGES.add(new Language(4, "Python"));
        LANGUAGES.add(new Language(5, "Java"));
        LANGUAGES.add(new Language(5, "JavaScript"));
        LANGUAGES.add(new Language(6, "Ruby"));
        LANGUAGES.add(new Language(7, "Swift"));
        LANGUAGES.add(new Language(8, "Go(GoLang)"));
        LANGUAGES.add(new Language(9, "PHP"));
        LANGUAGES.add(new Language(10, "Rust"));
    }

}
