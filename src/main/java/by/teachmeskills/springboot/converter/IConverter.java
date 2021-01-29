package by.teachmeskills.springboot.converter;



import by.teachmeskills.springboot.entity.IEntity;
import by.teachmeskills.springboot.model.IModel;

import java.util.List;

public interface IConverter<M extends IModel, E extends IEntity> {

    M convertToModel(E entity);
    E convertToEntity(M model);
    List<M> convertAllToModels(List<E> entities);
    List<E> convertAllToEntities(List<M> models);


}
