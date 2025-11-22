package pl.wsb.fitnesstracker.activitytype;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "activity_type")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class ActivityType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @Column(name = "activity_type", nullable = false, unique = true)
    private String activityType;

    public ActivityType(String activityType) {
        this.activityType = activityType;
    }
}
