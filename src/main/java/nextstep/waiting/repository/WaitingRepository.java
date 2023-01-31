package nextstep.waiting.repository;

import nextstep.waiting.domain.Waiting;

import java.util.List;

public interface WaitingRepository {

    Waiting insert(Waiting waiting);

    Waiting getById(Long id);

    Waiting getFirstByReservationId(Long reservationId);

    List<Waiting> getByMemberId(Long memberId);

    boolean deleteById(Long id);
}
