package api.cartoon.service;

import api.cartoon.entity.Cartoon;

import java.util.List;

public interface CartoonService {
    Cartoon createOrUpdate(Cartoon cartoon);
    List<Cartoon> getAll();
    Cartoon getTodaysCharacter();
}
