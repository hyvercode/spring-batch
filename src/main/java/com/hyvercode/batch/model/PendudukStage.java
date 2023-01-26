package com.hyvercode.batch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
