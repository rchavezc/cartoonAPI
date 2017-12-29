package api.cartoon.converter;

import api.cartoon.dto.BasicDto;
import api.cartoon.entity.BasicEntity;

import java.util.List;

public interface EntityDtoConverter<Entity extends BasicEntity, Dto extends BasicDto> {
    Dto toDto(Entity entity);

    Entity toEntity(Dto dto);

    List<Dto> toDto(Iterable<Entity> entities);

    List<Entity> toEntity(Iterable<Dto> dtos);
}
