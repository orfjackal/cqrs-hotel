// Copyright © 2016 Esko Luontola
// This software is released under the Apache License 2.0.
// The license text is at http://www.apache.org/licenses/LICENSE-2.0

package fi.luontola.cqrshotel.reservation.events;

import fi.luontola.cqrshotel.framework.Event;
import fi.luontola.cqrshotel.util.Struct;

import java.time.LocalDate;
import java.util.UUID;

public class SearchedForAccommodation extends Struct implements Event {

    public final UUID reservationId;
    public final LocalDate startDate;
    public final LocalDate endDate;

    public SearchedForAccommodation(UUID reservationId, LocalDate startDate, LocalDate endDate) {
        this.reservationId = reservationId;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
