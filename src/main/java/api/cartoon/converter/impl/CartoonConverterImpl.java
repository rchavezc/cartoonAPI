package api.cartoon.converter.impl;

import api.cartoon.converter.CartoonConverter;
import api.cartoon.dto.CartoonDto;
import api.cartoon.entity.Cartoon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartoonConverterImpl implements CartoonConverter {
    @Override
    public CartoonDto toDto(Cartoon entity) {
        CartoonDto cartoonDto = new CartoonDto();
        cartoonDto.setId(entity.getId());
        cartoonDto.setName(entity.getName());
        cartoonDto.setBirthDate(entity.getBirthDate());
        cartoonDto.setCharacter(entity.getCharacter());
        return cartoonDto;
    }

    @Override
    public Cartoon toEntity(CartoonDto dto) {
        Cartoon cartoon = new Cartoon();
        if (dto.getId() != null)
            cartoon.setId(dto.getId());
        cartoon.setName(dto.getName());
        cartoon.setBirthDate(dto.getBirthDate());
        cartoon.setCharacter(dto.getCharacter());
        return cartoon;
    }

    @Override
    public List<CartoonDto> toDto(Iterable<Cartoon> cartoons) {
        List<CartoonDto> list = new ArrayList<>();
        cartoons.forEach(e -> list.add(toDto(e)));
        return list;
    }

    @Override
    public List<Cartoon> toEntity(Iterable<CartoonDto> cartoonDtos) {
        List<Cartoon> list = new ArrayList<>();
        cartoonDtos.forEach(e -> list.add(toEntity(e)));
        return list;
    }
}
