package boot.junit.mockito.service;

import boot.junit.mockito.domain.HeroRepository;
import boot.junit.mockito.domain.HeroRepositoryImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class HeroServiceImpl implements HeroService {

    HeroRepository heroRepository = new HeroRepositoryImpl();

    @Override
    public String get() {
        return heroRepository.get();
    }
}
