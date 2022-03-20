package com.coffee.coffeemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Chi_Tiet_Phan_Quyen")
public class PermissionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ma_CT_Phan_Quyen")
    private long id;

    @ManyToOne
    @JoinColumn(name = "Ma_Chuc_Vu", nullable = false)
    private Permission permission;

    @ManyToOne
    @JoinColumn(name = "Ma_Phan_Quyen", nullable = false)
    private Position position;
}
