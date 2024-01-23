package Kodlama.io.ProgrammingSubTechno.business.concretes;

import Kodlama.io.ProgrammingSubTechno.business.abstracts.LanguageService;
import Kodlama.io.ProgrammingSubTechno.dataAccess.abstracts.MyRepository;
import Kodlama.io.ProgrammingSubTechno.entities.concretes.Language;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class LanguageManager implements LanguageService {

    private MyRepository myRepository;
    @Override
    public void Add(Language language) {
        myRepository.Add(language);
    }

    @Override
    public void Delete(Language language) {
        myRepository.Delete(language);
    }

    @Override
    public void Update(Language currentLanguage, Language targetLanguage) {
        myRepository.Update(currentLanguage, targetLanguage);
    }

    @Override
    public List<Language> getLanguages() {

        return new ArrayList<>();
    }
}
