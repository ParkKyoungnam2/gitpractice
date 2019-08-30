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