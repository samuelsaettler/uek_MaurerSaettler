package ch.noseryoung.uk.domainModels.auction.dto;

import ch.noseryoung.uk.domainModels.auction.Auction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-03T11:31:00+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@Component
public class AuctionMapperImpl implements AuctionMapper {

    @Override
    public Auction fromDTO(AuctionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Auction auction = new Auction();

        auction.setId( dto.getId() );
        auction.setDescription( dto.getDescription() );
        auction.setFixed_price( dto.getFixed_price() );
        auction.setStarting_price( dto.getStarting_price() );
        auction.setIs_public( dto.isIs_public() );

        return auction;
    }

    @Override
    public List<Auction> fromDTOs(List<AuctionDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Auction> list = new ArrayList<Auction>( dtos.size() );
        for ( AuctionDTO auctionDTO : dtos ) {
            list.add( fromDTO( auctionDTO ) );
        }

        return list;
    }

    @Override
    public Set<Auction> fromDTOs(Set<AuctionDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Auction> set = new HashSet<Auction>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( AuctionDTO auctionDTO : dtos ) {
            set.add( fromDTO( auctionDTO ) );
        }

        return set;
    }

    @Override
    public AuctionDTO toDTO(Auction dm) {
        if ( dm == null ) {
            return null;
        }

        AuctionDTO auctionDTO = new AuctionDTO();

        auctionDTO.setId( dm.getId() );
        auctionDTO.setDescription( dm.getDescription() );
        auctionDTO.setFixed_price( dm.getFixed_price() );
        auctionDTO.setStarting_price( dm.getStarting_price() );
        auctionDTO.setIs_public( dm.isIs_public() );

        return auctionDTO;
    }

    @Override
    public List<AuctionDTO> toDTOs(List<Auction> dms) {
        if ( dms == null ) {
            return null;
        }

        List<AuctionDTO> list = new ArrayList<AuctionDTO>( dms.size() );
        for ( Auction auction : dms ) {
            list.add( toDTO( auction ) );
        }

        return list;
    }

    @Override
    public Set<AuctionDTO> toDTOs(Set<Auction> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<AuctionDTO> set = new HashSet<AuctionDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Auction auction : dms ) {
            set.add( toDTO( auction ) );
        }

        return set;
    }
}
