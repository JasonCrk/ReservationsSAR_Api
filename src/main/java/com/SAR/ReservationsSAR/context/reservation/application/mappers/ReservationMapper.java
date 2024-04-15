package com.SAR.ReservationsSAR.context.reservation.application.mappers;

import com.SAR.ReservationsSAR.context.establishment.application.mappers.EstablishmentMapper;
import com.SAR.ReservationsSAR.context.reservation.application.responses.ReservationItemResponse;
import com.SAR.ReservationsSAR.context.reservation.domain.Reservation;
import com.SAR.ReservationsSAR.context.topic.application.mappers.TopicMapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", imports = {TopicMapper.class, EstablishmentMapper.class})
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    ReservationItemResponse toItem(Reservation reservation);

    List<ReservationItemResponse> toItemList(List<Reservation> reservations);
}