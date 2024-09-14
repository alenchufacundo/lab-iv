const { URL_BASE } = require('../constants/constants');
const axios = require('axios');

const getCountries = async (req, res) => {
    const API_KEY = 'bf7a401b24f4a859a398126b96a6336b';  // Reemplaza con tu clave API


    try {
        // Llamada a la API para obtener todos los países
        const response = await axios.get(`${URL_BASE}all`, {
            params: {
                access_key: API_KEY
            }
        });

        // Limitar el resultado a los primeros 20 países y devolver solo capital, nombre y región
        const countries = response.data.slice(0, 20).map(country => ({
            name: country.name,
            capital: country.capital,
            region: country.region
        }));

        // Enviar la respuesta con los 20 países
        res.status(200).json({
            msg: 'Ok',
            data: countries
        });
    } catch (error) {
        res.status(400).json({
            msg: 'Error',
            error: error.message
        });
    }
};

module.exports = {
    getCountries
};

