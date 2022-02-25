package com.case2.addressRegistration.controller;


import com.case2.addressRegistration.dto.AddressDto;
import com.case2.addressRegistration.dto.AddressSaveRequestDto;
import com.case2.addressRegistration.entity.*;
import com.case2.addressRegistration.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddressController {

    private final CountryService countryService;
    private final CityService cityService;
    private final DistrictService districtService;
    private final NeighborhoodService neighborhoodService;
    private final StreetService streetService;
    private final AddressService addressService;

    @PostMapping("/country")
    public ResponseEntity saveCountry(@RequestBody Country country){

        country = countryService.saveCountry(country);

        return ResponseEntity.ok(country);
    }

    @GetMapping("/country/{countryCode}")
    public ResponseEntity findByCountryCode(@PathVariable String countryCode){

        Country country = countryService.findByCountryCode(countryCode);

        return ResponseEntity.ok(country);
    }

    @PostMapping("/city")
    public ResponseEntity saveCity(@RequestBody City city){

        city = cityService.saveCity(city);

        return ResponseEntity.ok(city);
    }

    @GetMapping("/city/{plateCode}")
    public ResponseEntity getCityByPlateCode(@PathVariable String plateCode){

        City city = cityService.getCityByPlateCode(plateCode);

        return ResponseEntity.ok(city);
    }

    @PostMapping("/district")
    public ResponseEntity saveDistrict(@RequestBody District district){

        district = districtService.saveDistrict(district);

        return ResponseEntity.ok(district);
    }

    @GetMapping("/district/{cityId}")
    public ResponseEntity findAllDistrictByCityId(@PathVariable Long cityId){

        List<District> districtList = districtService.findAllDistrictByCityId(cityId);

        return ResponseEntity.ok(districtList);
    }

    @PostMapping("/neighborhood")
    public ResponseEntity saveNeighborhood(@RequestBody Neighborhood neighborhood){

        neighborhood = neighborhoodService.saveNeighborhood(neighborhood);

        return ResponseEntity.ok(neighborhood);
    }

    @PatchMapping("/neighborhood/{id}")
    public ResponseEntity updateNeighborhoodName(@PathVariable Long id, @RequestParam String name){

        Neighborhood neighborhood = neighborhoodService.updateNeighborhoodName(id, name);

        return ResponseEntity.ok(neighborhood);
    }

    @GetMapping("/neighborhood/{districtId}")
    public ResponseEntity findAllNeighborhoodByDistrictId(@PathVariable Long districtId){

        List<Neighborhood> neighborhoodList = neighborhoodService.findAllNeighborhoodByDistrictId(districtId);

        return ResponseEntity.ok(neighborhoodList);
    }

    @PostMapping("/street")
    public ResponseEntity saveStreet(@RequestBody Street street){

        street = streetService.saveStreet(street);

        return ResponseEntity.ok(street);
    }

    @PatchMapping("/street/{id}")
    public ResponseEntity updateStreetName(@PathVariable Long id, @RequestParam String name){

        Street street = streetService.updateStreetName(id, name);

        return ResponseEntity.ok(street);
    }

    @GetMapping("/street/{neighborhoodId}")
    public ResponseEntity findAllStreetByNeighborhoodId(@PathVariable Long neighborhoodId){

        List<Street> streetList = streetService.findAllStreetByNeighborhoodId(neighborhoodId);

        return ResponseEntity.ok(streetList);
    }

    @PostMapping()
    public ResponseEntity saveAddress(@RequestBody AddressSaveRequestDto addressSaveRequestDto){

        AddressDto addressDto = addressService.saveAddress(addressSaveRequestDto);

        return ResponseEntity.ok(addressDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAddress(@PathVariable Long id){

        addressService.deleteAddress(id);

        return ResponseEntity.ok(Void.TYPE);
    }

    @GetMapping("/{id}")
    public ResponseEntity findAddressById(@PathVariable Long id){

        AddressDto addressDto = addressService.findAddressById(id);

        return ResponseEntity.ok(addressDto);
    }


}
