const axios = require('axios');
const { request, response } = require('express');
const { URL_BASE } = require('../constants/constants'); // Asegúrate de que la constante URL_BASE esté bien definida

const getContinentes = (req = request, res = response) => {
  const { country = '', capital = '' } = req.query; // Obtén los parámetros de consulta si es necesario
  console.log(country, capital);

  // Realiza una petición a la API usando axios
  axios.get(`${URL_BASE}/continent.json`)
    .then((response) => {
      const { data = [] } = response; // Obtén los datos de la respuesta de la API
      console.log(data);

      // Envía la respuesta con el código de estado 200 y los datos obtenidos
      res.status(200).json({
        msg: 'Ok',
        data
      });
    })
    .catch((error) => {
      // Maneja los errores
      console.error(error);
      res.status(400).json({
        msg: 'Error',
        error: error.message // Envia un mensaje más legible del error
      });
    });
};

module.exports = {
  getContinentes
};