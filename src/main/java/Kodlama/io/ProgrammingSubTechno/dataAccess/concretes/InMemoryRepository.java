package Kodlama.io.ProgrammingSubTechno.dataAccess.concretes;

import Kodlama.io.ProgrammingSubTechno.Common.Helper;
import Kodlama.io.ProgrammingSubTechno.dataAccess.abstracts.MyRepository;
import Kodlama.io.ProgrammingSubTechno.entities.concretes.Language;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements MyRepository {

    private List<Language> myList = Helper.LANGUAGES;
    @Override
    public void Add(Language language) {

        myList.add(language);
    }

    @Override
    public void Delete(Language language) {
        myList.remove(language);
    }

    @Override
    public void Update(Language currentLanguage, Language targetLanguage) {

        for(Language language : myList) {
            if(language == currentLanguage){
                currentLanguage = targetLanguage;
            }
        }

    }

    @Override
    public List<Language> getLanguages() {

        return  myList;
    }
}
