delete SPE_EINVOICEDETAIL;

delete SPE_EINVOICEHEADER;

insert into SPE_EINVOICEHEADER(
    tipoDocumentoEmisor,
    numeroDocumentoEmisor,
    tipoDocumento,
    serieNumero,
    razonSocialEmisor,
    fechaEmision,
    correoEmisor,
    tipoDocumentoAdquiriente,
    numeroDocumentoAdquiriente,
    razonSocialAdquiriente,
    correoAdquiriente,
    tipoMoneda,
    totalValorVentaNetoOpGravadas,
    totalValorVentaNetoOpNoGravada,
    totalValorVentaNetoOpExonerada,
    totalDescuentos,
    totalIgv,
    totalVenta,
    codigoLeyenda_1,
    textoLeyenda_1
) values (
    '6',
    '20501827623',
    '01',
    'FLT1-00000030',
    'Telefónica Gestión de Servicios Compartidos Perú S.A.C.',
    '2015-03-02',
    'carlos.echeverria@labtech.pe',
    '6',
    '20563330709',
    'LABTECH S.R.L.',
    'carlos.echeverria@labtech.pe',
    'PEN',
    '100.00',
    '0.00',
    '0.00',
    '0.00',
    '18.00',
    '118.00',
    '1000',
    'CIENTO DIECIOCHO Y 00/100 NUEVOS SOLES'
);

insert into SPE_EINVOICEDETAIL (
    tipoDocumentoEmisor,
    numeroDocumentoEmisor,
    tipoDocumento,
    serieNumero,
    numeroOrdenItem,
    codigoProducto,
    descripcion,
    cantidad,
    unidadMedida,
    importeUnitarioSinImpuesto,
    importeUnitarioConImpuesto,
    codigoImporteUnitarioConImpues,
    importeTotalSinImpuesto,
    codigoRazonExoneracion,
    importeIgv
) values (
    '6',
    '20501827623',
    '01',
    'FLT1-00000030',
    '1',
    '000001',
    'Articulo',
    '1.00',
    'NIU',
    '100.00',
    '118.00',
    '01',
    '100.00',
    '10',
    '18.00'
);

update SPE_EINVOICEHEADER set BL_ESTADOREGISTRO = 'A';
