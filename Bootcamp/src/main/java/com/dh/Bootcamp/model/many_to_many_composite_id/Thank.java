/*
package com.dh.Bootcamp.model.many_to_many_composite_id;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

import javax.persistence.Column;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "thank")
public class Thank {

    @EmbeddedId
    ThankId id = new ThankId();







    @ManyToOne
    @MapsId("noteId")
    @JoinColumn(name = "note_id")
    Note note;





    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    User user;












    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt = new Date();






    public Thank(User user, Note note) {
        this.setUser(user);
        this.setNote(note);
    }

}
*/
