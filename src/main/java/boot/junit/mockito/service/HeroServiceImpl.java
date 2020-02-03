package boot.junit.mockito.service;

import boot.junit.mockito.domain.HeroRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class HeroServiceImpl implements HeroService {

    HeroRepository heroRepository;

    @Override
    public String get() {
        return heroRepository.get();
    }
}
