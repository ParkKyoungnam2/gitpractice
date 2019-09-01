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