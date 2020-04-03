package ch.noseryoung.uk.domainModels.bid.dto;

import ch.noseryoung.uk.domainModels.bid.Bid;
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
public class BidMapperImpl implements BidMapper {

    @Override
    public Bid fromDTO(BidDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Bid bid = new Bid();

        bid.setId( dto.getId() );
        bid.setAmount( (int) dto.getAmount() );

        return bid;
    }

    @Override
    public List<Bid> fromDTOs(List<BidDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Bid> list = new ArrayList<Bid>( dtos.size() );
        for ( BidDTO bidDTO : dtos ) {
            list.add( fromDTO( bidDTO ) );
        }

        return list;
    }

    @Override
    public Set<Bid> fromDTOs(Set<BidDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Bid> set = new HashSet<Bid>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( BidDTO bidDTO : dtos ) {
            set.add( fromDTO( bidDTO ) );
        }

        return set;
    }

    @Override
    public BidDTO toDTO(Bid dm) {
        if ( dm == null ) {
            return null;
        }

        BidDTO bidDTO = new BidDTO();

        bidDTO.setId( dm.getId() );
        bidDTO.setAmount( dm.getAmount() );

        return bidDTO;
    }

    @Override
    public List<BidDTO> toDTOs(List<Bid> dms) {
        if ( dms == null ) {
            return null;
        }

        List<BidDTO> list = new ArrayList<BidDTO>( dms.size() );
        for ( Bid bid : dms ) {
            list.add( toDTO( bid ) );
        }

        return list;
    }

    @Override
    public Set<BidDTO> toDTOs(Set<Bid> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<BidDTO> set = new HashSet<BidDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Bid bid : dms ) {
            set.add( toDTO( bid ) );
        }

        return set;
    }
}
