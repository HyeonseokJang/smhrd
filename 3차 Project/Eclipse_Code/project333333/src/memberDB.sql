create or replace view ses_app as
select ses_roomid, ses_product as ses_pname, ses_roomnum, ses_date as, ses_electricity, ses_usingtime * ses_wh as use_wh from ses_electricityuse

select * from ses_electricityuse



insert into ses_electricityuse values ('a',101,'sr1',sysdate-1,2.1,2.1,3)
insert into ses_electricityuse values ('b',101,'sr3',sysdate-1,1.6,1.6,3)
insert into ses_electricityuse values ('c',101,'sr1',sysdate-1,2,2,2)

insert into ses_electricityuse values ('a',101,'sr1',sysdate-1,2.1,2.1,3);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-1,1.6,1.6,3);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-1,2,2,2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-2,3.2,3.2,1.5)
insert into ses_electricityuse values ('b',101,'sr3',sysdate-2,2,2,2.2)
insert into ses_electricityuse values ('c',101,'sr1',sysdate-2,3,1.6,1.6)

insert into ses_electricityuse values ('a',101,'sr1',sysdate-3,4,4,1.2)
insert into ses_electricityuse values ('b',101,'sr3',sysdate-3,2,2,1.5)
insert into ses_electricityuse values ('c',101,'sr1',sysdate-3,2,2,2.2)

insert into ses_electricityuse values ('a',101,'sr1',sysdate-4,3,3,1.1)
insert into ses_electricityuse values ('b',101,'sr3',sysdate-4,2,2,1.7)
insert into ses_electricityuse values ('c',101,'sr1',sysdate-4,1,1,2)

insert into ses_electricityuse values ('a',101,'sr1',sysdate-5,3,3,2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-5,2,2,2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-5,1,1,1);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-6,1.7,1.7,1.2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-6,2,2,1.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-6,1,1,2.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-7,1,1,3.1);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-7,2,2,1.8);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-7,2,2,2.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-8,1.9,1.9,2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-8,2,2,1.6);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-8,2,2,2.5);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-9,3,3,2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-9,2,2,2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-9,2,2,2.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-10,1.7,1.7,3);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-10,2,2,1.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-10,1,1,2.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-11,2,2,1.2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-11,2,2,1.6);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-11,2,2,2.1);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-12,3,3,1.2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-12,2,2,1.7);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-12,1,1,0.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-13,1,1,1);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-13,2,2,1);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-13,1,1,1);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-14,1.7,1.7,1.1);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-14,2,2,1.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-14,1,1,2.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-15,3,1.7,1.7);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-15,2,2,1.1);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-15,1,1,2.6);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-16,1.1,1.1,2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-16,2,2,1);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-16,3,3,1.7);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-17,2,2,1.1);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-17,3,3,1.1);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-17,2,2,1.5);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-18,1.6,1.7,1.2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-18,2,3,1.3);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-18,1,1,2.7);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-19,1,1,1);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-19,2,2,1);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-19,1,1,1.7);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-20,1.7,1.7,3);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-20,2,2,1.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-20,1,1,2.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-21,1,1,1);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-21,2,2,1);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-21,1,1,1);


insert into ses_electricityuse values ('a',101,'sr1',sysdate-22,1.7,1.7,1.2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-22,2,2,1.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-22,1,1,2.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-23,2,2,3);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-23,2,2,1.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-23,2,2,2.1);


insert into ses_electricityuse values ('a',101,'sr1',sysdate-24,1.7,1.7,2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-24,3,2,1.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-24,1,1,2.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-25,2.1,2,1.6);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-25,2,2,1.6);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-25,2,2,2.1);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-26,2.1,2.1,3);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-26,1.6,1.6,3);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-26,2,2,2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-27,3.2,3.2,1.5);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-27,2,2,2.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-27,3,1.6,1.6);


insert into ses_electricityuse values ('a',101,'sr1',sysdate-28,2.1,2.1,2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-28,2,2,1);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-28,1.1,2,2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-29,1.2,3.2,1.5);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-29,1,2,2.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-29,1,1.6,1.6);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-30,1.1,3.2,1.5);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-30,1.1,2,2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-30,1.1,1.2,1.2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-31,1.3,3.2,1.1);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-31,1.1,1.5,1.5);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-31,1.6,1.2,1.1);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-32,2.1,3.2,1.2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-32,1.1,2,2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-32,1.4,1.3,1.25);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-33,3.1,3.2,1.5);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-33,2,2,2.2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-33,3,1.6,1.6);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-34,2.1,2.1,3);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-34,1.6,1.6,3);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-34,2,2,2);

insert into ses_electricityuse values ('a',101,'sr1',sysdate-35,2,2,1.1);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-35,3,3,1.1);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-35,2,2,1.5);


insert into ses_electricityuse values ('a',101,'sr1',sysdate-36,1,3,2);
insert into ses_electricityuse values ('b',101,'sr3',sysdate-36,2,2,2);
insert into ses_electricityuse values ('c',101,'sr1',sysdate-36,2,2,2.1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate,1,1,1);
insert into ses_electricityuse values ('b',102,'sr3',sysdate,0.2,0,6);
insert into ses_electricityuse values ('c',102,'sr1',sysdate,1,1,2.6);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-1,4,4,1.2);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-1,2,2,1.5);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-1,2,2,2.2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-2,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-2,1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-2,1,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-3,1.6,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-3,1.6,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-3,1.5,2,1);


insert into ses_electricityuse values ('a',102,'sr1',sysdate-4,2.1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-4,2.1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-4,2.1,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-5,1.7,2,2);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-5,1.8,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-5,1.5,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-6,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-6,1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-6,2,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-7,1,2,1.9);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-7,1,2,2.1);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-7,1,2,2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-8,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-8,2,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-8,2,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-9,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-9,1.2,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-9,3,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-10,2,2,2.2);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-10,1,2,2.1);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-10,1,2,4);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-11,1.8,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-11,1.1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-11,1,2,2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-12,2,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-12,2.2,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-12,2.1,2,1);


insert into ses_electricityuse values ('a',102,'sr1',sysdate-13,1.6,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-13,1.6,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-13,1.6,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-14,1,2,2.1);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-14,1,2,2.1);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-14,1,2,1,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-15,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-15,1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-15,1,2,1.8);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-16,2,2,2);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-16,3,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-16,1,2,2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-17,1,1,1);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-17,1,1,1);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-17,1,2,2.2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-18,2,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-18,2.2,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-18,2.1,2,1);


insert into ses_electricityuse values ('a',102,'sr1',sysdate-19,1.6,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-19,1.6,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-19,1.6,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-20,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-20,2,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-20,2,2,1.1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-21,1.8,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-21,2.1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-21,2,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-22,1.3,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-22,1,2,1.3);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-22,2,2,1.1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-23,1,2,1.98);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-23,2,2,2.21);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-23,2,2,1.2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-24,2,2,2.21);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-24,2,2,1.7);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-24,2,2,1.52);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-25,2,2,1);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-25,2,2,1);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-25,2,2,1);


insert into ses_electricityuse values ('a',102,'sr1',sysdate-26,1,2,3.11);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-26,2,2,1.5);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-26,3,2,1.2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-27,1,2,1);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-27,2,2,1);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-27,1,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-28,1.7,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-28,1.6,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-28,2.6,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-29,1,2,1.7);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-29,0.3,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-29,2,2,1.2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-30,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-30,2,2,1.4);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-30,2,2,1);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-31,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-31,1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-31,1,2,2);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-32,1,2,3.2);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-32,2,2,2.2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-32,2,2,1.8);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-33,1,2,3.2);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-33,2.2,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-33,2,2,1.7);

insert into ses_electricityuse values ('a',102,'sr1',sysdate-34,1,2,1.8);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-34,1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-34,4,2,1);


insert into ses_electricityuse values ('a',102,'sr1',sysdate-35,1,2,3);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-35,1,2,2);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-35,1,2,1);


insert into ses_electricityuse values ('a',102,'sr1',sysdate-36,1,2,1.1);
insert into ses_electricityuse values ('b',102,'sr3',sysdate-36,1,2,2.8);
insert into ses_electricityuse values ('c',102,'sr1',sysdate-36,1,2,1.3);

insert into ses_electricityuse values ('a',103,'sr1',sysdate,3.1,3.2,1.5);
insert into ses_electricityuse values ('b',103,'sr3',sysdate,2,2,2.2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate,3,1.6,1.6);



insert into ses_electricityuse values ('a',103,'sr1',sysdate-1,2,2,1.1);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-1,3,3,1.1);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-1,2,2,1.5);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-2,3,3,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-2,2,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-2,2,2,2.1);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-3,1,1,1);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-3,0.2,0,6);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-3,1,1,2.6);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-4,3,3,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-4,2,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-4,1,1,1);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-5,1.7,1.7,1.2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-5,2,2,1.2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-5,1,1,2.2);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-6,3,3,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-6,2,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-6,1,1,1);



insert into ses_electricityuse values ('a',103,'sr1',sysdate-7,3,3,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-7,2,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-7,2,2,2.1);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-8,1,1,1);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-8,0.2,0,6);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-8,1,1,2.6);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-9,4,4,1.2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-9,2,2,1.5);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-9,2,2,2.2);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-10,3.2,3.2,1.5)
insert into ses_electricityuse values ('b',103,'sr3',sysdate-10,2,2,2.2)
insert into ses_electricityuse values ('c',103,'sr1',sysdate-10,0,1.6,1.6)


insert into ses_electricityuse values ('a',103,'sr1',sysdate-11,1,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-11,1,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-11,1,2,1.8);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-12,2,2,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-12,3,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-12,1,2,2);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-13,1.3,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-13,1,2,1.3);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-13,2,2,1.1);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-14,1,2,1.98);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-14,2,2,2.21);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-14,2,2,1.2);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-15,1,1,1);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-15,2,2,1);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-15,1,1,1.7);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-16,1.7,1.7,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-16,2,2,1.2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-16,1,1,2.2);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-17,1,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-17,1,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-17,1,2,1);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-18,1.6,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-18,1.6,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-18,1.5,2,1);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-19,2.1,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-19,2.1,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-19,2.1,2,1);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-20,1,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-20,1,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-20,1,2,1.8);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-21,2,2,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-21,3,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-21,1,2,2);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-22,1,1,1);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-22,2.2,2,1);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-22,1,1,1.7);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-23,1,1,1);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-23,2,2,1);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-23,1,1,1.7);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-24,2,1.7,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-24,2,2,1.2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-24,1.2,1,2.2);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-25,1.1,1.7,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-25,2.1,2,1.2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-25,1.1,1,2.2);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-26,1.2,3.2,1.5);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-26,1,2,2.2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-26,1,1.6,1.6);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-27,1.1,3.2,1.5);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-27,1.1,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-27,1.3,1.2,1.2);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-28,4,4,1.2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-28,2,2,1.5);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-28,2,2,2.2);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-29,1,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-29,1,2,2.1);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-29,1,2,1);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-30,1.6,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-30,1.6,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-30,1.5,2,1);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-31,1,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-31,1,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-31,1.25,2,1.8);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-32,2,2,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-32,3.1,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-32,1,2,2);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-33,1,2,3);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-33,1,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-33,1,2,1.8);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-34,2,2,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-34,3,2,2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-34,1,2,2);

insert into ses_electricityuse values ('a',103,'sr1',sysdate-35,3.2,3.2,1.5);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-35,2,2,2.2);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-35,3,1.6,1.6);


insert into ses_electricityuse values ('a',103,'sr1',sysdate-36,2,2.1,2);
insert into ses_electricityuse values ('b',103,'sr3',sysdate-36,2,1,2,1);
insert into ses_electricityuse values ('c',103,'sr1',sysdate-36,1.4,2,2);




select * from ses_app where ses_roomnum='101' order by ses_date 


select * from member
select * from ses_electricityuse

select to_char(ses_date, 'yy/mm/dd'), sum(use_wh) from ses_app where ses_date like '__%02%__' and ses_roomid='a' and ses_roomnum='101' group by to_char(ses_date,'yy/mm/dd') order by to_char(ses_date,'yy/mm/dd') 


select sum(ses_wh) from ses_electricityuse where ses_date like '__%03%__' and ses_roomnum = '101'

select * from HR.member

select * from smartmember


REM INSERTING into HR.MEMBER
SET DEFINE OFF;
Insert into SES_MEMBER (NO,ID,PW,NAME,SEX,TEL,ADDR,MAIL,ROOM,ACCEPT) values ('1','wkdgustjr','1234','¿Â«ˆºÆ','≥≤','010-2021-0301','±§¡÷CGIºæ≈Õ','SES1@CGI.com','201','2');
Insert into SES_MEMBER (NO,ID,PW,NAME,SEX,TEL,ADDR,MAIL,ROOM,ACCEPT) values ('7','rladnsql','1234','±ËøÓ∫Ò','ø©','010-0022-0011','±§¡÷CGIºæ≈Õ','SESO@CGI.com','101','2');
Insert into SES_MEMBER (NO,ID,PW,NAME,SEX,TEL,ADDR,MAIL,ROOM,ACCEPT) values ('2','dhrudals','1234','ø¿∞ÊπŒ','≥≤','010-2021-0302','±§¡÷CGIºæ≈Õ','SES2@CGI.com','202','2');
Insert into SES_MEMBER (NO,ID,PW,NAME,SEX,TEL,ADDR,MAIL,ROOM,ACCEPT) values ('3','fbgnsgml','1234','∑˘»∆»Ò','≥≤','010-2021-0303','±§¡÷CGIºæ≈Õ','SES3@CGI.com','203','2');
Insert into SES_MEMBER (NO,ID,PW,NAME,SEX,TEL,ADDR,MAIL,ROOM,ACCEPT) values ('4','dbstmdwn','1234','¿±Ω¬¡÷','ø©','010-2021-0305','±§¡÷CGIºæ≈Õ','SES4@CGI.com','301','2');
Insert into HR.MEMBER (NO,ID,PW,NAME,SEX,TEL,ADDR,MAIL,ROOM,ACCEPT) values ('5','dlatjdfl','1234','¿”º∫∏Æ','ø©','010-2021-0228','±§¡÷CGIºæ≈Õ','SES5@CGI.com','302','2');
Insert into HR.MEMBER (NO,ID,PW,NAME,SEX,TEL,ADDR,MAIL,ROOM,ACCEPT) values ('0','admin','1234','¡÷¿Œ','female','010-2021-0306','±§¡÷CGIºæ≈Õ','SES@CGI.com','∞¸∏Æ¿⁄','100');
Insert into HR.MEMBER (NO,ID,PW,NAME,SEX,TEL,ADDR,MAIL,ROOM,ACCEPT) values ('6','dhguswhd','1234','ø¿«ˆ¡æ','≥≤','010-2021-0220','±§¡÷CGIºæ≈Õ','SES6@CGI.com','303','2');

select * from ses_member

alter table ses_member add (ses_roomnum varchar2(50));

select * from ses_member
insert into ses_member  values ('1','wkdgustjr','1234','¿Â«ˆºÆ','≥≤','010-2021-0301','±§¡÷CGIºæ≈Õ','SES1@CGI.com','a','2','201');
insert into ses_member  values ('2','dhrudals','1234','ø¿∞ÊπŒ','≥≤','010-2021-0302','±§¡÷CGIºæ≈Õ','SES1@CGI.com','b','2','201');
insert into ses_member  values ('0','admin','1234','¡÷¿Œ','ø©','010-2021-0302','±§¡÷CGIºæ≈Õ','SES1@CGI.com','f','100','∞¸∏Æ¿⁄');
insert into ses_member  values ('3','sj','1234','¿±Ω¬¡÷','ø©','010-4105-5093','±§¡÷CGIºæ≈Õ','SES1@CGI.com','a','2','101');

select * from ses_member where ses_roomid='a' and ses_roomnum='101'
select sum(use_wh) from ses_app where ses_roomid='a' and ses_roomnum='101'
select sum(use_wh) from ses_app where ses_roomid='a' and ses_date like '__%03%__' and ses_roomnum='101'

select * from ses_app where ses_date like '__%03%__' and ses_roomid='a' and ses_roomnum='101'
