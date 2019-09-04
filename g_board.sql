create SEQUENCE g_seq;

create table g_board(
    bno NUMBER(10,0), -- 글번호
    bname varchar2(50) not null, -- 작성자
    btitle varchar2(200) not null, -- 글제목 
    bcontent varchar2(2000) not null, -- 글내용
    bdate date default sysdate, -- 작성일
    bupdatedate date default sysdate, -- 수정일
    bhit number(10,0), -- 조회수
    bgroup number(10,0), -- 계층형 게시판 구현에 필요한 요소
    bstep number (4,0) default 0,
    bindent number(4,0) default 0);

alter table g_board add constraint pk_g_board primary key (bno);

insert into g_board(bno, bname, btitle, bcontent, bgroup)
values (g_seq.nextval, 'user', 'title', 'content', g_seq.currval);

select * from g_board;

commit;

alter table 
g_board 
modify 
(bhit default 0);

commit;

alter table
g_board
modify
(bgroup not null);

commit;

select count(*) from g_board;

update g_board set bhit =0;

select * from g_board order by bGroup desc, bStep asc;

select sysdate from dual;

update g_board set bName = '수정된 작성자명' , bTitle = '수정된 글제목' , bContent = '수정된 글 내용' where bno = 1;

update g_board set bHit = bHit+1 where bno = 1;

update g_board set bHit = bHit+1 where bno = 1;

insert into g_board (bno, bname, btitle, bcontent, bgroup)
(select g_seq.nextval, bname, btitle, bcontent, g_seq.currval from g_board);
-- 기존 데이터를 다시 붙여 넣는 식으로 데이터를 늘림
select * from (    
    select
    rownum rn,
    a.*
    from
        (select
        *
        from
        g_board
        order by
        bgroup desc,
        bstep asc) a)
where rn > 10 and rn <= 20;

