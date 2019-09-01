create SEQUENCE g_seq;

create table g_board(
    bno NUMBER(10,0), -- �۹�ȣ
    bname varchar2(50) not null, -- �ۼ���
    btitle varchar2(200) not null, -- ������ 
    bcontent varchar2(2000) not null, -- �۳���
    bdate date default sysdate, -- �ۼ���
    bupdatedate date default sysdate, -- ������
    bhit number(10,0), -- ��ȸ��
    bgroup number(10,0), -- ������ �Խ��� ������ �ʿ��� ���
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

update g_board set bName = '������ �ۼ��ڸ�' , bTitle = '������ ������' , bContent = '������ �� ����' where bno = 1;