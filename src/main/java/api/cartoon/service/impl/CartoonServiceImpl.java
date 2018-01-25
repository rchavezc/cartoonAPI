package api.cartoon.service.impl;

import api.cartoon.dao.CartoonDao;
import api.cartoon.entity.Cartoon;
import api.cartoon.service.CartoonService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class CartoonServiceImpl implements CartoonService {

    @Autowired
    CartoonDao cartoonDao;

    @Override
    public Cartoon createOrUpdate(Cartoon cartoon) {
        return cartoonDao.save(cartoon);
    }

    @Override
    public List<Cartoon> getAll() {
        Iterable<Cartoon> iterable = cartoonDao.findAll();
        return Lists.newArrayList(iterable);
    }

    @Override
    public Cartoon getTodaysCharacter() {
        return cartoonDao.findByBirthDate(Calendar.getInstance().getTimeInMillis());
    }
}
