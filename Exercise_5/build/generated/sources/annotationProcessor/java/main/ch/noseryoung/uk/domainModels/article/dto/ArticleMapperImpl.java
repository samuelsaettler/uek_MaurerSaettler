package ch.noseryoung.uk.domainModels.article.dto;

import ch.noseryoung.uk.domainModels.article.Article;
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
public class ArticleMapperImpl implements ArticleMapper {

    @Override
    public Article fromDTO(ArticleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Article article = new Article();

        if ( dto.getId() != null ) {
            article.setId( Integer.parseInt( dto.getId() ) );
        }
        article.setName( dto.getName() );
        article.setDescription( dto.getDescription() );
        article.setValue( dto.getValue() );

        return article;
    }

    @Override
    public List<Article> fromDTOs(List<ArticleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Article> list = new ArrayList<Article>( dtos.size() );
        for ( ArticleDTO articleDTO : dtos ) {
            list.add( fromDTO( articleDTO ) );
        }

        return list;
    }

    @Override
    public Set<Article> fromDTOs(Set<ArticleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Article> set = new HashSet<Article>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( ArticleDTO articleDTO : dtos ) {
            set.add( fromDTO( articleDTO ) );
        }

        return set;
    }

    @Override
    public ArticleDTO toDTO(Article dm) {
        if ( dm == null ) {
            return null;
        }

        ArticleDTO articleDTO = new ArticleDTO();

        articleDTO.setName( dm.getName() );
        articleDTO.setId( String.valueOf( dm.getId() ) );
        articleDTO.setDescription( dm.getDescription() );
        articleDTO.setValue( dm.getValue() );

        return articleDTO;
    }

    @Override
    public List<ArticleDTO> toDTOs(List<Article> dms) {
        if ( dms == null ) {
            return null;
        }

        List<ArticleDTO> list = new ArrayList<ArticleDTO>( dms.size() );
        for ( Article article : dms ) {
            list.add( toDTO( article ) );
        }

        return list;
    }

    @Override
    public Set<ArticleDTO> toDTOs(Set<Article> dms) {
        if ( dms == null ) {
            return null;
        }

        Set<ArticleDTO> set = new HashSet<ArticleDTO>( Math.max( (int) ( dms.size() / .75f ) + 1, 16 ) );
        for ( Article article : dms ) {
            set.add( toDTO( article ) );
        }

        return set;
    }
}
