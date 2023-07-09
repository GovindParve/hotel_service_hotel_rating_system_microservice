package com.in.HotelService.services;

import com.in.HotelService.entities.Hotel;

import java.util.List;
public interface HotelService {


    //create
    public Hotel create(Hotel hotel);

    //get all hotels
    public List<Hotel> getAllHotels();

    //get single hotel
    public Hotel getHotel(String id);

}
