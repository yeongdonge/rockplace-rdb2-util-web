package rockplace.rdb2.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEngineer is a Querydsl query type for Engineer
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEngineer extends EntityPathBase<Engineer> {

    private static final long serialVersionUID = 143844857L;

    public static final QEngineer engineer = new QEngineer("engineer");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final EnumPath<rockplace.rdb2.enums.EngineerPosition> position = createEnum("position", rockplace.rdb2.enums.EngineerPosition.class);

    public QEngineer(String variable) {
        super(Engineer.class, forVariable(variable));
    }

    public QEngineer(Path<? extends Engineer> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEngineer(PathMetadata metadata) {
        super(Engineer.class, metadata);
    }

}

