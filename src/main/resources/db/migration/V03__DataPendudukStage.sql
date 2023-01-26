create table data_penduduk_stage (
  nik             character varying(64)  not null primary key,
  nama_identitias character varying(100) not null,
  tanggal_lahir   date                   not null
);