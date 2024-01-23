package Kodlama.io.ProgrammingSubTechno.dataAccess.abstracts;

import Kodlama.io.ProgrammingSubTechno.entities.concretes.Language;

import java.util.List;

public interface MyRepository {

    public void Add(Language language);
    public void Delete(Language language);
    public void Update(Language currentLanguage, Language targetLanguage);
    public List<Language> getLanguages();

}
