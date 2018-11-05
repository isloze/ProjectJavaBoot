package com.mifel.mx.pojos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "USUARIO_WEBMX", schema = "MEXWEB")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "LOGIN")
	private String login;
	@Basic(optional = false)
	@Column(name = "PASSWORD")
	private String password;
	@Basic(optional = false)
	@Column(name = "NOMBRE")
	private String nombre;
	@Basic(optional = false)
	@Column(name = "CLIENTE")
	private Long cliente;
	@Column(name = "EMAIL")
	private String email;
	@Basic(optional = false)
	@Column(name = "FECHAALTA", insertable = true, updatable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date fechaalta;
	@Column(name = "FECHABAJA")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date fechabaja;
	@Basic(optional = false)
	@Column(name = "STATUS")
	private Character status;
	@Basic(optional = false)
	@Column(name = "INTENTOS")
	private Short intentos;
	@Column(name = "FECHAREVOCADO")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date fecharevocado;
	@Column(name = "FECHA_VIGENCIA")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date fechaVigencia;
	@Column(name = "NO_ACCESO")
	private Long noAcceso;

	@Column(name = "FECHA_CADUCIDAD_PWD")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date fechaCaducidadPwd;

	@Transient
	private String clienteDesc;
	@Transient
	private boolean statusB;

	public User(String login) {
		this.login = login;
	}

	protected User() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}

	public Date getFechabaja() {
		return fechabaja;
	}

	public void setFechabaja(Date fechabaja) {
		this.fechabaja = fechabaja;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Short getIntentos() {
		return intentos;
	}

	public void setIntentos(Short intentos) {
		this.intentos = intentos;
	}

	public Date getFecharevocado() {
		return fecharevocado;
	}

	public void setFecharevocado(Date fecharevocado) {
		this.fecharevocado = fecharevocado;
	}

	public Date getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public Long getNoAcceso() {
		return noAcceso;
	}

	public void setNoAcceso(Long noAcceso) {
		this.noAcceso = noAcceso;
	}

	public Date getFechaCaducidadPwd() {
		return fechaCaducidadPwd;
	}

	public void setFechaCaducidadPwd(Date fechaCaducidadPwd) {
		this.fechaCaducidadPwd = fechaCaducidadPwd;
	}

	public boolean isStatusB() {
		return statusB;
	}

	public void setStatusB(boolean statusB) {
		this.statusB = statusB;
	}

	public String getClienteDesc() {
		return clienteDesc;
	}

	public void setClienteDesc(String clienteDesc) {
		this.clienteDesc = clienteDesc;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + (this.login != null ? this.login.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final User other = (User) obj;
		if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "UserWebmx{" + "login=" + login + ", password=" + password + ", nombre=" + nombre + ", cliente="
				+ cliente + ", email=" + email + ", fechaalta=" + fechaalta + ", fechabaja=" + fechabaja + ", status="
				+ status + ", intentos=" + intentos + ", fecharevocado=" + fecharevocado + ", fechaVigencia="
				+ fechaVigencia + ", noAcceso=" + noAcceso + ", fechaCaducidadPwd=" + fechaCaducidadPwd
				+ ", telOficina=" + ", extension=" + ", celular=" + '}';
	}

}
