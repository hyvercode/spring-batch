package com.hyvercode.batch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Entity
@Data
@Table(name = "data_penduduk_stage")
@NoArgsConstructor
@AllArgsConstructor
public class PendudukStage {

    private String nik;
    private String namaLengkap;
    private String tanggalLahir;
}
