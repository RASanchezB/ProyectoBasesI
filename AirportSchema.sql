create schema airport;

use airport;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `airport`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avion`
--

CREATE TABLE `avion` (
  `no_registro` int(11) NOT NULL,
  `av_modelo` varchar(15) NOT NULL,
  `no_modelo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `controlador_aereo`
--

CREATE TABLE `controlador_aereo` (
  `fecha_examen` date DEFAULT NULL,
  `dni` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `dni` int(11) NOT NULL,
  `emp_afiliacion` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo`
--

CREATE TABLE `modelo` (
  `no_modelo` int(11) NOT NULL,
  `mod_capacidad` int(11) DEFAULT NULL,
  `mod_peso` int(11) DEFAULT NULL,
  `no_registro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modtec_tiene`
--

CREATE TABLE `modtec_tiene` (
  `maestria` varchar(25) DEFAULT NULL,
  `no_modelo` int(11) NOT NULL,
  `dni` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pruebas`
--

CREATE TABLE `pruebas` (
  `no_prueba` int(11) NOT NULL,
  `pr_nombre` varchar(25) DEFAULT NULL,
  `pr_puntuacion` varchar(3) DEFAULT NULL,
  `pr_fecha` date DEFAULT NULL,
  `pr_horas` int(11) DEFAULT NULL,
  `pr_calificacion` varchar(3) DEFAULT NULL,
  `no_registro` int(11) NOT NULL,
  `dni` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnico`
--

CREATE TABLE `tecnico` (
  `tec_nombre` varchar(25) DEFAULT NULL,
  `tec_direccion` varchar(50) DEFAULT NULL,
  `tec_telefono` varchar(11) DEFAULT NULL,
  `tec_sueldo` int(11) DEFAULT NULL,
  `dni` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `avion`
--
ALTER TABLE `avion`
  ADD PRIMARY KEY (`no_registro`),
  ADD KEY `no_modelo` (`no_modelo`);

--
-- Indices de la tabla `controlador_aereo`
--
ALTER TABLE `controlador_aereo`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD PRIMARY KEY (`no_modelo`),
  ADD KEY `no_registro` (`no_registro`);

--
-- Indices de la tabla `modtec_tiene`
--
ALTER TABLE `modtec_tiene`
  ADD KEY `no_modelo` (`no_modelo`),
  ADD KEY `dni` (`dni`);

--
-- Indices de la tabla `pruebas`
--
ALTER TABLE `pruebas`
  ADD PRIMARY KEY (`no_prueba`),
  ADD KEY `no_registro` (`no_registro`),
  ADD KEY `dni` (`dni`);

--
-- Indices de la tabla `tecnico`
--
ALTER TABLE `tecnico`
  ADD PRIMARY KEY (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `avion`
--
ALTER TABLE `avion`
  MODIFY `no_registro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `dni` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `modelo`
--
ALTER TABLE `modelo`
  MODIFY `no_modelo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pruebas`
--
ALTER TABLE `pruebas`
  MODIFY `no_prueba` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `avion`
--
ALTER TABLE `avion`
  ADD CONSTRAINT `avion_ibfk_1` FOREIGN KEY (`no_modelo`) REFERENCES `modelo` (`no_modelo`);

--
-- Filtros para la tabla `controlador_aereo`
--
ALTER TABLE `controlador_aereo`
  ADD CONSTRAINT `controlador_aereo_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `empleado` (`dni`);

--
-- Filtros para la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD CONSTRAINT `modelo_ibfk_1` FOREIGN KEY (`no_registro`) REFERENCES `avion` (`no_registro`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `modtec_tiene`
--
ALTER TABLE `modtec_tiene`
  ADD CONSTRAINT `modtec_tiene_ibfk_1` FOREIGN KEY (`no_modelo`) REFERENCES `modelo` (`no_modelo`),
  ADD CONSTRAINT `modtec_tiene_ibfk_2` FOREIGN KEY (`dni`) REFERENCES `tecnico` (`dni`);

--
-- Filtros para la tabla `pruebas`
--
ALTER TABLE `pruebas`
  ADD CONSTRAINT `pruebas_ibfk_1` FOREIGN KEY (`no_registro`) REFERENCES `avion` (`no_registro`),
  ADD CONSTRAINT `pruebas_ibfk_2` FOREIGN KEY (`dni`) REFERENCES `tecnico` (`dni`);

--
-- Filtros para la tabla `tecnico`
--
ALTER TABLE `tecnico`
  ADD CONSTRAINT `tecnico_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `empleado` (`dni`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
