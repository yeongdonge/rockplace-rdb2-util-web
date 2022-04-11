package rockplace.rdb2.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInspection is a Querydsl query type for Inspection
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInspection extends EntityPathBase<Inspection> {

    private static final long serialVersionUID = 1107278462L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInspection inspection = new QInspection("inspection");

    public final StringPath comment = createString("comment");

    public final QCustomer customer;

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QInspection(String variable) {
        this(Inspection.class, forVariable(variable), INITS);
    }

    public QInspection(Path<? extends Inspection> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInspection(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInspection(PathMetadata metadata, PathInits inits) {
        this(Inspection.class, metadata, inits);
    }

    public QInspection(Class<? extends Inspection> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

