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
@Table(name = "data_penduduk")
@NoArgsConstructor
@AllArgsConstructor
public class Penduduk {

    private String nik;
    private String namaLengkap;
    private String tanggalLahir;
}
