package api.cartoon.controller;

import api.cartoon.converter.CartoonConverter;
import api.cartoon.dto.CartoonDto;
import api.cartoon.service.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cartoon")
public class CartoonController {
    @Autowired
    private CartoonService cartoonService;

    @Autowired
    private CartoonConverter cartoonConverter;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    public CartoonDto save(@RequestBody CartoonDto cartoonDto){
        return cartoonConverter.toDto(cartoonService.createOrUpdate(cartoonConverter.toEntity(cartoonDto)));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public List<CartoonDto> getAll(){
        return cartoonConverter.toDto(cartoonService.getAll());
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = "application/json")
    public CartoonDto getToadysCharacter(){
        return cartoonConverter.toDto(cartoonService.getTodaysCharacter());
    }
}
